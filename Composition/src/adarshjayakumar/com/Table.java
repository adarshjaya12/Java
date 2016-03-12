package adarshjayakumar.com;

/**
 * Created by adarsh on 3/11/2016.
 */
public class Table {
    private int drawers;
    private Size size;
    private String color;


    public Table(int drawers, Size size, String color) {
        this.drawers = drawers;
        this.size = size;
        this.color = color;

    }

    public void openDrawer()
    {
        System.out.println("Drawer has been opened to get some files");
    }

    public int getDrawers() {
        return drawers;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
