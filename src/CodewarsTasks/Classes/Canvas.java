package CodewarsTasks.Classes;

class Canvas {

    private int width;
    private int height;


    public Canvas(int width, int height) {
        this.height = height;
        this.width = width;

    }

    public Canvas draw(int x1, int y1, int x2, int y2) {
        return this;
    }

    public Canvas fill(int x, int y, char ch) {
        return this;
    }

    public String drawCanvas() {
        return "draw the canvas with borders";
    }
}