class Solution {
    public int maxArea(int[] heights) {

        int start = 0;
        int end = heights.length-1;
        int area = 0;

        while(start<=end)
        {
            int current_area = Math.min(heights[start],heights[end]) * (end-start);

            area = Math.max(area,current_area);

            if(heights[start]<heights[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        
        return area;
    }
}
