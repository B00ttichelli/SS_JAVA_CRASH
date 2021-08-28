package CodewarsTasks.Classes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class building_blocks {

    @Test
    public void testBasicBlock() throws Exception {
        Block b = new Block(new int[]{2, 2, 2});
        assertEquals(2, b.getWidth());
        assertEquals(2, b.getLength());
        assertEquals(2, b.getHeight());
        assertEquals(8, b.getVolume());
        assertEquals(24, b.getSurfaceArea());
    }


    public static class Block {
        private int width;
        private int height;
        private int length;


        public Block(int [] arr) {

            this.width = arr[0];
            this.length = arr[1];
            this.height = arr[2];

        }

        public int getVolume(){
            return width*length*height;
        }

        public int getSurfaceArea(){
            return (2*length*width)+(2*length*height)+(2*height*width);
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int getLength() {
            return length;
        }
    }

}
