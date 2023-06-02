package ObjectsAndClasses_StaticFinal;

 class MemoryRam {
     public String getType() {
         return type;
     }
     public void setType(String type) {
         this.type = type;
     }
     public int getVolume() {
         return volume;
     }
     public void setVolume(int volume) {
         this.volume = volume;
     }

     public static double getWeight() {
         return weight;
     }
     public void setWeight(int weight) {
         this.weight = weight;
     }
     String type;
    int volume;
    static double weight;

        public MemoryRam(){
//            String type;
//            int volume;
//            int weight;

        }

        void setMemoryRam(String type,int volume,double weight){
            this.type=type;
            this.volume=volume;
            this.weight = weight;
        }


 }


