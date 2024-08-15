package animation;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class KreisQuadratAnimation extends Application{
	@Override
	public void start(Stage meineStage) throws Exception {
		//Layout AnchorPane
		AnchorPane rootNode = new AnchorPane();
		
		Scene meineScene = new Scene(rootNode, 600, 400);
		
		//Den Kreis erstellen
		Circle kreis = new Circle (30);
		//Linienfarbe
		kreis.setStroke(Color.BLUE);
		//Linienbreite
		kreis.setStrokeWidth(2);
		//F�llfarbe
		kreis.setFill(Color.BLACK);
		//Position auf X- und Y-Achse festlegen
		kreis.setLayoutX(180);
		kreis.setLayoutY(180);
		
		//Den Kreis2 erstellen
		Circle kreis2 = new Circle (10);
		//Linienfarbe
		kreis2.setStroke(Color.RED);
		//Linienbreite
		kreis2.setStrokeWidth(2);
		//F�llfarbe
		kreis2.setFill(Color.YELLOW);
		//Position auf X- und Y-Achse festlegen
		kreis2.setLayoutX(280);
		kreis2.setLayoutY(280);
		
		//Das Quadrat erstellen
		Rectangle quadrat = new Rectangle(230, 230);
		//Linienfarbe
		quadrat.setStroke(Color.GREEN);
		//Linienbreite
		quadrat.setStrokeWidth(2);
		//F�llfarbe
		quadrat.setFill(Color.BLACK);
		//Position auf X- und Y-Achse festlegen
		quadrat.setLayoutX(350);
		quadrat.setLayoutY(70);
		
		//Das Quadrat2 erstellen
		Rectangle quadrat2 = new Rectangle(110, 110);
		//Linienfarbe
		quadrat2.setStroke(Color.ORANGE);
		//Linienbreite
		quadrat2.setStrokeWidth(2);
		//F�llfarbe
		quadrat2.setFill(Color.GREEN);
		//Position auf X- und Y-Achse festlegen
		quadrat2.setLayoutX(250);
		quadrat2.setLayoutY(90);
		
		//Instanz der Klasse ScaleTransition f�r den Kreis erstellen		
		ScaleTransition zoomKreis = new ScaleTransition(Duration.millis(2000),kreis);
		//X- und Y-Achse mit dem Faktor 2 vergr��ern
		zoomKreis.setByX(2);
		zoomKreis.setByY(2);
		//Animation 10 Mal ausf�hren
		//CycleCount auf 20 setzen damit es 10 Mal gr��er wird und 10 Mal zur�ck l�uft
		zoomKreis.setCycleCount(20);
		//Animation l�uft automatisch r�ckw�rts
		zoomKreis.setAutoReverse(true);
		//Animation abspielen
		zoomKreis.play();
		
		//Instanz der Klasse ScaleTransition f�r den Kreis erstellen		
		ScaleTransition zoomKreis2 = new ScaleTransition(Duration.millis(1000),kreis2);
		//X- und Y-Achse mit dem Faktor 3 vergr��ern
		zoomKreis2.setByX(3);
		zoomKreis2.setByY(3);
		//Animation 20 Mal ausf�hren
		//CycleCount auf 40 setzen damit es 20 Mal gr��er wird und 20 Mal zur�ck l�uft
		zoomKreis2.setCycleCount(40);
		//Animation l�uft automatisch r�ckw�rts
		zoomKreis2.setAutoReverse(true);
		//Animation abspielen
		zoomKreis2.play();
		
		//Instanz der Klasse ScaleTransition f�r das Quadrat erstellen
		ScaleTransition zoomQuadrat = new ScaleTransition(Duration.millis(2000),quadrat);
		//X- und Y-Achse mit dem Faktor -0,5 vergr��ern / verkleinern
		zoomQuadrat.setByX(-0.5);
		zoomQuadrat.setByY(-0.5);
		//Animation 10 Mal ausgef�hren
		//CycleCount auf 20 setzen damit es 10 Mal kleiner wird und 10 Mal zur�ck l�uft
		zoomQuadrat.setCycleCount(20);
		//Animation l�uft automatisch r�ckw�rts
		zoomQuadrat.setAutoReverse(true);
		//Animation abspielen
		zoomQuadrat.play();
		
		//Instanz der Klasse ScaleTransition f�r das Quadrat erstellen
		ScaleTransition zoomQuadrat2 = new ScaleTransition(Duration.millis(1000),quadrat2);
		//X- und Y-Achse mit dem Faktor -0,8 vergr��ern / verkleinern
		zoomQuadrat2.setByX(-0.8);
		zoomQuadrat2.setByY(-0.8);
		//Animation 20 Mal ausf�hren
		//CycleCount auf 40 setzen damit es 20 Mal gr��er wird und 20 Mal zur�ck l�uft
		zoomQuadrat2.setCycleCount(40);
		//Animation l�uft automatisch r�ckw�rts
		zoomQuadrat2.setAutoReverse(true);
		//Animation abspielen
		zoomQuadrat2.play();
		
		//Shapes hinzuf�gen
		rootNode.getChildren().add(kreis);
		rootNode.getChildren().add(quadrat);
		rootNode.getChildren().add(kreis2);
		rootNode.getChildren().add(quadrat2);
		//Titel setzen
		meineStage.setTitle("Eine Animation mit Kreis und Quadrat");
		meineStage.setScene(meineScene);
		//und anzeigen
		meineStage.show();
	}

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		launch(args);
	}
}
