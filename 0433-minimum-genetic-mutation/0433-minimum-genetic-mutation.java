class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        
        Set<String> validGenes = new HashSet<>(Arrays.asList(bank));
        
        Queue<String> queue = new LinkedList<>();
        queue.offer(startGene);
        
        Set<String> visited = new HashSet<>();
        visited.add(startGene);
        
        int mutations = 0;
        
        char[] chars = {'A', 'C', 'G', 'T'};
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentGene = queue.poll();
                if (currentGene.equals(endGene)) {
                    return mutations;
                }
                
                for (int j = 0; j < currentGene.length(); j++) {
                    char[] geneArray = currentGene.toCharArray();
                    for (char c : chars) {
                        geneArray[j] = c;
                        String newGene = new String(geneArray);
                        if (validGenes.contains(newGene) && !visited.contains(newGene)) {
                            queue.offer(newGene);
                            visited.add(newGene);
                        }
                    }
                }
            }
            mutations++;
        }
        
        return -1;
    }
}