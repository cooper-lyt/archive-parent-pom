package cc.coopersoft.business.model;

public class BusinessDefineSummary {

    public BusinessDefineSummary() {
    }

    public BusinessDefineSummary(String id, String name, String category, int priority, int categoryPriority, String memo) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.priority = priority;
        this.categoryPriority = categoryPriority;
        this.memo = memo;
    }

    private String id;

    private String name;

    private String category;

    private int priority;

    private int categoryPriority;

    private String memo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getCategoryPriority() {
        return categoryPriority;
    }

    public void setCategoryPriority(int categoryPriority) {
        this.categoryPriority = categoryPriority;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}