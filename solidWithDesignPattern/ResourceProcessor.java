package solidWithDesignPattern;

import java.util.Map;

public class ResourceProcessor {
    private final Map<String, ResourceBorrower> resourceType;

    public ResourceProcessor(Map<String, ResourceBorrower> resourceType) {
        this.resourceType = resourceType;
    }

    public void borrowResource(Student student, Resource resource) {
        ResourceBorrower resourceBorrower = resourceType.get(resource.getResourceType());

        if (!resourceType.containsKey(resource.getResourceType())) {
            throw new IllegalArgumentException("Invalid resource type: " + resource.getResourceType());
        }

        resourceBorrower.borrowResource(student, resource);
    }

}
