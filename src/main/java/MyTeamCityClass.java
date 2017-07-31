import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.serverSide.discovery.BreadthFirstRunnerDiscoveryExtension;
import jetbrains.buildServer.serverSide.discovery.DiscoveredObject;
import jetbrains.buildServer.util.CollectionsUtil;
import jetbrains.buildServer.util.browser.Element;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by naduxa on 11.07.2017.
 */
public class MyTeamCityClass extends BreadthFirstRunnerDiscoveryExtension {

    public static final String CMAKE_LISTS_TXT = "CMakeLists.txt";

    @Override
    protected List<DiscoveredObject> discoverRunnersInDirectory(final Element dir, final List<Element> files) {
       return null;
    }
}
