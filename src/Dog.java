public class Dog {
        public String breed;
        public String size;
        public String color;
        public int age;

           public void testDog(){
            this.breed = "Beagle";
            this.size = "Large";
            this.color = "Light Gray";
            this.age = 5;
        System.out.println("Dog Object 1: \n Breed: "+breed+"\n Size: "+size+"\n Color: "+color+"\n Age: "+age);
  }
        public void testDog2(){
            this.breed = "Bulldog";
            this.size = "Large";
            this.color = "Orange";
            this.age = 6;
        System.out.println("Dog Object 2: \n Breed: "+breed+"\n Size: "+size+"\n Color: "+color+"\n Age: "+age);
        }
         public void testDog3(){
            this.breed = "German Shepherd";
            this.size = "Large";
            this.color = "white and Orange";
            this.age = 6;
         System.out.println("Dog Object 3: \n Breed: "+breed+"\n Size: "+size+"\n Color: "+color+"\n Age: "+age);
    }
}