     public enum ProductionType {
        TECHNOLOGIES(""),
        AUTOMOBILES(""),
        GARDEN_TOOLS(""),
        FOOD("");

        private String productionDescription;

        ProductionType(String productionDescription) {
            this.productionDescription = productionDescription;
        }

        public String getTriangleDescription() {
            return productionDescription;
        }
    }



