package 객체지향.디자인패턴.AbstractFactoryPattern;

interface IButton {
    void Paint();
}

interface IGUIFactory {
    IButton CreateButton();
}

class WinFactory implements IGUIFactory {
    public IButton CreateButton() {
        return new WinButton();
    }
}

class OSXFactory implements IGUIFactory {
    public IButton CreateButton() {
        return new OSXButton();
    }
}

class WinButton implements IButton {
    public void Paint() {
        //Render a button in a Windows style
    }
}

class OSXButton implements IButton {
    public void Paint() {
        //Render a button in a Mac OS X style
    }
}

class Program {
    static void Main() {
//        var appearance = Settings.Appearance;
//
//        IGUIFactory factory;
//        switch (appearance) {
//            case Appearance.Win:
//                factory = new WinFactory();
//                break;
//            case Appearance.OSX:
//                factory = new OSXFactory();
//                break;
//            default:
//                throw new System.NotImplementedException();
//        }
//        var button = factory.CreateButton();
//        button.Paint();
    }
}