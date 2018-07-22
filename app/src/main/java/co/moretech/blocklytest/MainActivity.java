package co.moretech.blocklytest;

import android.support.annotation.NonNull;

import com.google.blockly.android.AbstractBlocklyActivity;
import com.google.blockly.android.codegen.CodeGenerationRequest;
import com.google.blockly.android.codegen.LoggingCodeGeneratorCallback;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AbstractBlocklyActivity {
    @NonNull
    @Override
    protected String getToolboxContentsXmlPath() {
        return "toolbox.xml";
    }

    @NonNull
    @Override
    protected List<String> getBlockDefinitionsJsonPaths() {
        List<String> paths = new ArrayList<>();
//        paths.addAll(DefaultBlocks.getAllBlockDefinitions());
        paths.add("blocks.json");
        return paths;
    }

    @NonNull
    @Override
    protected List<String> getGeneratorsJsPaths() {
        List<String> generators = new ArrayList<>();
        generators.add("generators.js");
        return generators;
    }

    @NonNull
    @Override
    protected CodeGenerationRequest.CodeGeneratorCallback getCodeGenerationCallback() {
        return new LoggingCodeGeneratorCallback(this, "MORE");
    }
}
