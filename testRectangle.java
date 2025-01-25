public static void testRectangle(int x1, int y1, int x4, int y4) { // tests rectangle
    
}
    
    private static int calculateArea(int x1, int y1, int x4, int y4) { // calculates the area of the rectangle
       int length = Math.abs(x4 - x1);
       int width = Math.abs(y4 - y1);
       return length * width;
    }
    private static int calculatePerimeter(int x1, int y1, int x4, int y4) { // calculates the perimeter of the rectangle
        int length = Math.abs(x4 - x1);
        int width = Math.abs(y4 - y1);
        return 2 * (length + width);
    }   