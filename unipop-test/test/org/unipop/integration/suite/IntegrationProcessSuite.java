package org.unipop.integration.suite;

import org.apache.tinkerpop.gremlin.GraphProviderClass;
import org.apache.tinkerpop.gremlin.process.ProcessStandardSuite;
import org.junit.runner.RunWith;
import org.unipop.integration.IntegrationGraphProvider;
import org.unipop.structure.UniGraph;

@RunWith(ProcessStandardSuite.class)
@GraphProviderClass(provider = IntegrationGraphProvider.class, graph = UniGraph.class)
public class IntegrationProcessSuite {
}