class Box{

   //private data members
   private double width;
   private double length;
   private double height;
   
   //set up no-arg constructor
   public Box(){
      width  = 1.0;
      length = 1.0;
      height = 1.0;
   }
   
   //set up 2-arg constructor
   public Box(double firstWidth, double firstLength){
      width  = firstWidth;
      length = firstLength;
      height = 1.0;
   }
   
   //set up 3-arg constructor
   public Box(double secondWidth, double secondLength, double secondHeight){
      width  = secondWidth;
      length = secondLength;
      height = secondHeight;
   }
   
   //Accessor Methods (Getters)
   public double getWidth(){
      return width;
   }
   public double getLength(){
      return length;
   }
   public double getHeight(){
      return height;
   }
   
   //Modifier Methods (Setters)
   public void setWidth(double chosenWidth){
      width = chosenWidth;
   }
   public void setLength(double chosenLength){
      length = chosenLength;
   }
   public void setHeight(double chosenHeight){
      height = chosenHeight;
   }
   
   //toString() Method to show data quickly
   public String toString(){
      return width+"W x "+length+"L x "+height+"H";
   }
   
   //method to add two boxes
   public  Box add(Box box1){
      double width1,length1,height1;
      double width2,length2,height2;
      double newWidth,newLength,newHeight;
      
      width1  = this.getWidth();
      length1 = this.getLength();
      height1 = this.getHeight();
      
      width2  = box1.getWidth();
      length2 = box1.getLength();
      height2 = box1.getHeight();
      
      newWidth  = width1  + width2;
      newLength = length1 + length2;
      newHeight = height1 + height2;
      
      Box newBox = new Box(newWidth,newLength,newHeight);
      return newBox;
   }
   
   //method to add double to the box
   public Box add(double addition){
      double width1,length1,height1;
      double width2,length2,height2;
      double add;
      
      width1 = this.getWidth();
      length1 = this.getLength();
      height1 = this.getHeight();
      
      add = addition;
      
      width2  = width1  + add;
      length2 = length1 + add;
      height2 = height1 + add;
      
      Box addBox = new Box(width2,length2,height2);
      return addBox;
   }
   //compares two fraction objects by comparing numerators and denominators
   public boolean equals(Box box1){
      double width1, length1,height1;
      double width2, length2,height2;
       
      width1  = this.getWidth();
      length1 = this.getLength();
      height1 = this.getHeight();
      
      width2  = box1.getWidth();
      length2 = box1.getLength();
      height2 = box1.getHeight();
      
      if(width1 == width2 && length1 == length2 && height1 == height2){
         return true;
      }
      return false;
   }
   private static final double BIG = 20;
   
   public boolean isBig(){
      double width,length,height;
      
      width  = this.getWidth();
      length = this.getLength();
      height = this.getHeight();
      
      if(width + length + height > BIG){
         return true;
      }
      return false;
   }
   
}//close class
      
