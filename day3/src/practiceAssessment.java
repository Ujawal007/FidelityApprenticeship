public class practiceAssessment {


}

class MultimediaDevice{
    String brand;
    String model;
    int yearOfManufacture;

    void displayInfo(){
        System.out.print("Device: Brand - " + brand);
        System.out.print(", Model - " + model);
        System.out.println(", Year of Manufacture - " + yearOfManufacture);
    }

}

class BasicMediaPlayer extends MultimediaDevice{

    String supportedFormats;

    void play(){
        System.out.print("Playing Multimedia Content.");
        System.out.println("Supported Formats: " + supportedFormats);
    }
}

class SmartTV extends MultimediaDevice{

    int screenSize;
    String smartFeatures;

    void show(){
        System.out.print("Screen size: "+screenSize+" Inches, ");
        System.out.println("Smart Features: "+smartFeatures);
    }

    void adjustment(){
        System.out.println("Adjusting volume on the Smart TV");
        System.out.println("Changing the channel on Smart TV");
    }
}

class HomeTheaterSystem extends SmartTV{

    String surroundSound;
    String subwoofer;

    void  controlAudioSettings(){
        System.out.println("Adjusting volume on Home Theatre System");
        System.out.println("Changing the channel on Home Theatre System");
        System.out.println("Adjusting bass on Home Theatre System");
        System.out.println("Adjusting treble on Home Theatre System");
    }
}


