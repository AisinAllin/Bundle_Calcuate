package bundlecalculate;

public class Main {
    public static void main(String[] args) {
        Bundle img = new BundleImage();
        Bundle flac = new BundleAudio();
        Bundle vid = new BundleVideo();

        //input
        img.input(img);
        flac.input(flac);
        vid.input(vid);

        //calculate
        img.calculate();
        flac.calculate();
        vid.calculate();

        //output
        img.output(img);
        flac.output(flac);
        vid.output(vid);
    }
}
