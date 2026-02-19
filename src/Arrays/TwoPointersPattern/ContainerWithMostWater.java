package Arrays.TwoPointersPattern;

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int h=1,w=1,area=0,maxArea=0;
        int leftPtr=0, rightPtr = height.length-1;
        while(leftPtr < rightPtr){
            w = rightPtr - leftPtr;
            h = Math.min(height[rightPtr],height[leftPtr]);
            area = w*h;
            maxArea = Math.max(area,maxArea);
            if(height[leftPtr] < height[rightPtr]) leftPtr++;
            else rightPtr--;
        }
        return maxArea;
    }
}