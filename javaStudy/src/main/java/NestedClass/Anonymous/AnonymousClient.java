package NestedClass.Anonymous;

public class AnonymousClient {
    public static void main(String args[]){
        AnonymousClient client = new AnonymousClient();
        client.setButtonLamdaListenr();
    }
    public void setButtonListener(){
        MagicButton button = new MagicButton();
        button.setListener(new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Cliecked");
            }
        });
        button.onClickProcess();
    }

    public void setButtonLamdaListenr(){
        MagicButton button = new MagicButton();
        button.setListener(()-> { System.out.println("Magic Button Cliecked");});
        button.onClickProcess();
    }
}
