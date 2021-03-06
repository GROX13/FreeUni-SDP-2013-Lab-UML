
public class Program {

	public static void main(String[] args) throws Exception {
        TextBox textBox = new TextBox();
        Caretaker caretaker = new Caretaker(textBox);
        System.out.println("ииииииииииииииииииииииии Initialize");
        textBox.setText("Hello world!");
        System.out.println("ииииииииииииииииииииииии Selection 3 -> 3");
        textBox.select(new Selection(3,3));
        textBox.moveCaretBy(2);
        System.out.println(textBox.getText());
        caretaker.snapshot();
        System.out.println("ииииииииииииииииииииииии Snapshot");
        System.out.println("ииииииииииииииииииииииии Edit");
        textBox.setText("Good bye world!");
        System.out.println("ииииииииииииииииииииииии Selection 4 -> 4");
        textBox.select(new Selection(4,5));
        textBox.moveCaretBy(8);
        System.out.println(textBox.getText());
        caretaker.snapshot();
        System.out.println("ииииииииииииииииииииииии Snapshot");
        System.out.println("ииииииииииииииииииииииии Edit");
        textBox.setText("Foo");
        System.out.println(textBox.getText());
        caretaker.undo();
        System.out.println("ииииииииииииииииииииииии Undo");
        System.out.println(textBox.getText());
        caretaker.undo();
        System.out.println("ииииииииииииииииииииииии Undo");
        System.out.println(textBox.getText());
	}

}
