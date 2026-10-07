/* 
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;

public class ImageProcessing implements ImageAnalysis.Analyzer {
    // https://developers.google.com/ml-kit/vision/text-recognition/v2/android?hl=de#java
    private TextRecognizer recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
    
    
    @Override 
    public void analyze(ImageProxy imageProxy) {
        Image mediaImage = ImageProxy.getImage();
        if (mediaImage != null) {
            InputImage image = InputImage.fromMediaImage(mediaImage, imageProxy.getImageInfo().getRotationDegrees());
        }

        recognizer.process(image)
            .addOnSuccessListener(visionText -> {
                // Erfogreich erkannt
                String extractedText = visionText.getText();
                for (Text.TextBlock block : visionText.getTextBlocks()) {
                    String blockText = block.getText();
                    // Hier kannst du mit den Blöcken arbeiten
                    FilteringString filter = new FilteringString();

                }
            })
            .addOnFailureListener(e -> {
                // Fehlerbehandlung beim Erkennen
            });
        }




}
        */