package zh_ember2;

public class Controller {
    
    private Ember ember;
    private View view;
    
    public Controller(Ember ember, View view) {
        this.ember = ember;
        this.view = view;
    }
    
    public static void main(String[] args) {
        Ember ember = new Ember("Gyula", 1988);
        View view = new View();
        Console console = new Console(ember);
        
        view.setVisible(true);
        console.start();
    }
}
