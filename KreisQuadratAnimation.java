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
		//Fuellfarbe
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
		//Fuellfarbe
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
		//Fuellfarbe
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
		//Fuellfarbe
		quadrat2.setFill(Color.GREEN);
		//Position auf X- und Y-Achse festlegen
		quadrat2.setLayoutX(250);
		quadrat2.setLayoutY(90);
		
		//Instanz der Klasse ScaleTransition fuer den Kreis erstellen		
		ScaleTransition zoomKreis = new ScaleTransition(Duration.millis(2000),kreis);
		//X- und Y-Achse mit dem Faktor 2 vergroessern
		zoomKreis.setByX(2);
		zoomKreis.setByY(2);
		//Animation 10 Mal ausfuehren
		//CycleCount auf 20 setzen damit es 10 Mal groesser wird und 10 Mal zurueck laeuft
		zoomKreis.setCycleCount(20);
		//Animation laeuft automatisch rueckwaerts
		zoomKreis.setAutoReverse(true);
		//Animation abspielen
		zoomKreis.play();
		
		//Instanz der Klasse ScaleTransition fuer den Kreis erstellen		
		ScaleTransition zoomKreis2 = new ScaleTransition(Duration.millis(1000),kreis2);
		//X- und Y-Achse mit dem Faktor 3 vergroessern
		zoomKreis2.setByX(3);
		zoomKreis2.setByY(3);
		//Animation 20 Mal ausfuehren
		//CycleCount auf 40 setzen damit es 20 Mal groesser wird und 20 Mal zurueck laeuft
		zoomKreis2.setCycleCount(40);
		//Animation laeuft automatisch rueckwaerts
		zoomKreis2.setAutoReverse(true);
		//Animation abspielen
		zoomKreis2.play();
		
		//Instanz der Klasse ScaleTransition fuer das Quadrat erstellen
		ScaleTransition zoomQuadrat = new ScaleTransition(Duration.millis(2000),quadrat);
		//X- und Y-Achse mit dem Faktor -0,5 vergroessern / verkleinern
		zoomQuadrat.setByX(-0.5);
		zoomQuadrat.setByY(-0.5);
		//Animation 10 Mal ausgefuehren
		//CycleCount auf 20 setzen damit es 10 Mal kleiner wird und 10 Mal zurueck laeuft
		zoomQuadrat.setCycleCount(20);
		//Animation laeuft automatisch rueckwaerts
		zoomQuadrat.setAutoReverse(true);
		//Animation abspielen
		zoomQuadrat.play();
		
		//Instanz der Klasse ScaleTransition fuer das Quadrat erstellen
		ScaleTransition zoomQuadrat2 = new ScaleTransition(Duration.millis(1000),quadrat2);
		//X- und Y-Achse mit dem Faktor -0,8 vergroessern / verkleinern
		zoomQuadrat2.setByX(-0.8);
		zoomQuadrat2.setByY(-0.8);
		//Animation 20 Mal ausfuehren
		//CycleCount auf 40 setzen damit es 20 Mal groesser wird und 20 Mal zurueck laeuft
		zoomQuadrat2.setCycleCount(40);
		//Animation laeuft automatisch rueckwaerts
		zoomQuadrat2.setAutoReverse(true);
		//Animation abspielen
		zoomQuadrat2.play();
		
		//Shapes hinzufuegen
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
