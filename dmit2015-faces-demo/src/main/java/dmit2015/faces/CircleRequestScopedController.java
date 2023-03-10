package dmit2015.faces;

import dmit2015.model.Circle;
import dmit2015.model.Rectangle;
import lombok.Getter;
import lombok.Setter;
import org.omnifaces.util.Messages;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("currentCircleRequestScopedController")
@RequestScoped  // create this object for one HTTP request and destroy after the HTTP response has been sent
public class CircleRequestScopedController {

    @Getter @Setter

    private double radius;

    private Circle currentCircle = new Circle();
    public String showArea(){
        var currentCircle = new Circle((radius));
        Messages.addGlobalInfo("The area of the circle with a {0} radius is {1}",
                currentCircle.getRadius(), currentCircle.area());
        return null;
    }

    public String showDiameter(){
        Messages.addGlobalInfo("The diameter of the circle with a {0} radius is {1}",
                currentCircle.getRadius(), currentCircle.diameter());
        return null;
    }

    public String showCircumference(){
        Messages.addGlobalInfo("The circumference of the circle with a {0} radius is {1}",
                currentCircle.getRadius(), currentCircle.circumference());
        return null;
    }

}