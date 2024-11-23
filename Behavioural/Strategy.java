package Behavioural;

// Strategy Interface
 interface AssetDescriptionStrategy {
    String describe();
}
//Concrete Strategies
class PersonalAssetsDescription implements AssetDescriptionStrategy {
    @Override
    public String describe() {
        return "Personal assets: Earbuds, Mobile Phone";
    }
}
class HRAssetsDescription implements AssetDescriptionStrategy {
    @Override
    public String describe() {
        return "Company asset: Bag from HR";
    }
}
class ITAssetsDescription implements AssetDescriptionStrategy {
    @Override
    public String describe() {
        return "Company asset: Laptop from IT Department";
    }
}
class FinanceAssetsDescription implements AssetDescriptionStrategy {
    @Override
    public String describe() {
        return "Company asset: PF Account from Finance Department";
    }
}
// Context Class
 class AssetContext {
    private AssetDescriptionStrategy strategy;

    public void setStrategy(AssetDescriptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String getAssetDescription() {
        return strategy.describe();
    }
}

// Client Code
public class Strategy {
    public static void main(String[] args) {
        AssetContext obj = new AssetContext();

        // Personal assets
        obj.setStrategy(new PersonalAssetsDescription());
        System.out.println(obj.getAssetDescription());

        // Company assets
        obj.setStrategy(new HRAssetsDescription());
        System.out.println(obj.getAssetDescription());

        obj.setStrategy(new ITAssetsDescription());
        System.out.println(obj.getAssetDescription());

        obj.setStrategy(new FinanceAssetsDescription());
        System.out.println(obj.getAssetDescription());
    }
}
