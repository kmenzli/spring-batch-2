package org.training.spring.job.structure;

import org.springframework.batch.item.file.FlatFileHeaderCallback;

import java.io.IOException;
import java.io.Writer;

public class StructureCustomHeader implements FlatFileHeaderCallback {
    @Override
    public void writeHeader(Writer writer) throws IOException {
        writer.write("DATE_NAISSANCE;PAYS;VILLE;CODE_POSTALE");
    }
}
