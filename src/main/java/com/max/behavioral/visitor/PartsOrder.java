package com.max.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

    private List<AtvPart> atvParts = new ArrayList<>();

    public void addPart(AtvPart part) {
        atvParts.add(part);
    }

    public List<AtvPart> getAtvParts() {
        return Collections.unmodifiableList(atvParts);
    }


    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart atvPart : atvParts) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
