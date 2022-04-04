class Solution {
    public boolean checkIfExist(int[] arr) { 
         Set<Integer> py= new HashSet<>();   
        for (int i : arr) {
            if (py.contains(2 * i) || (i % 2 == 0 && py.contains(i / 2)))
                return true;
            py.add(i);
        }
        return false;
    }
}
