class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1])); // Descending by number Of Units Per Box
        int count = 0;
        for(int arr[] : boxTypes)
        {
            int box = arr[0];
            int units = arr[1];
            int rem = Math.min(truckSize, box); // boxes to choose
            count += (rem * units);
            truckSize -= rem;
            if(truckSize == 0)
                break;
        }
        return count++;
    }
}