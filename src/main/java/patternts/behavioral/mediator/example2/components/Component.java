package patternts.behavioral.mediator.example2.components;

import patternts.behavioral.mediator.example2.mediator.Mediator;

public interface Component {

    void setMediator(Mediator mediator);
    String getName();
}
