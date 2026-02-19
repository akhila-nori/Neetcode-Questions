package Arrays;

class ContainerWithMostWaterBruteForce {
    public int maxArea(int[] height) {
        int h=1,w=1,area=1,maxArea=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                h=Math.min(height[i],height[j]);
                w=j-i;
                area=h*w;
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}