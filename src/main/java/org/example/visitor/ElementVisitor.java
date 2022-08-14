package org.example.visitor;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XMLElement xe) {
        System.out.println(
                "processing an XML element with uuid: " + xe.getUuid());
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println(
                "processing a JSON element with uuid: " + je.getUuid());
    }


}
