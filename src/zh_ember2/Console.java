package zh_ember2;

public class Console {
    private Ember ember;
    
    public Console(Ember ember) {
        this.ember = ember;
    }
    
    public void start() {
        System.out.println(ember.bemutatkozas());
    }
}
