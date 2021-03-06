package css;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;

public class Stylesheet {

    private final ArrayList<Selector> selectors;
    private ArrayList<DeclareBlock> blocks;
    private HashMap<String, Selector> mergedSelectors;

    public Stylesheet() {
        selectors = new ArrayList<>();
        blocks = new ArrayList<>();
    }

    public void addBlock(DeclareBlock block) {
        blocks.add(block);
    }


    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (Selector selector : selectors) {
            buffer.append(selector.toString());
        }
        buffer.delete(buffer.length() - 1, buffer.length());
        return buffer.toString();
    }

    public ArrayList<Selector> getSelectors() {
        return selectors;
    }

    public void addSelector(Selector selector) {
        selectors.add(selector);
    }
}
