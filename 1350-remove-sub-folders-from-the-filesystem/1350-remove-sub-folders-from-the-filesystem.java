class Solution {
public List<String> removeSubfolders(String[] folder) {    
        Arrays.sort(folder);
        
        List<String> result = new ArrayList<>();
        String prev = "";  
        for (String current : folder) {
            if (prev.isEmpty() || !current.startsWith(prev + "/")) {
                result.add(current);
                prev = current;  
            }
        }
        return result;
    }
};