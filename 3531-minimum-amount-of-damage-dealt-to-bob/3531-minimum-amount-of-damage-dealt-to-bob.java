class Solution {

    class quartle {
        int damage;
        int health;
        int timeToKill;
        double ratio;
        
        quartle(int d, int h) {
            damage = d;
            health = h;
            timeToKill = (int) Math.ceil((1.0*health)/pow);
            ratio = (1.0*timeToKill)/damage;
        }
    }
    int pow;
    public long minDamage(int power, int[] damage, int[] health) {
        pow = power;
        long dps = 0;
        for(int d : damage) {
            dps += d;
        }


        PriorityQueue<quartle> pq = new PriorityQueue<quartle>((a,b) -> a.ratio > b.ratio ? 1 : -1);
        
        for(int i=0; i<damage.length; i++) {
            pq.add(new quartle(damage[i], health[i]));
        }

        long res = 0l;

        while(pq.size() > 0) {
            quartle b = pq.remove();
            res += dps*(b.timeToKill);
            dps -= b.damage;
        }

        return res;

    }
}