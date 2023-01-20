import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int answer=0;
    int points=0;
    String text1= "Technology has both been a blessing and a curse that humans have created. While the merits of technology is difficult to refute, the demerits are always on the news and the topic of every other conversation. Thanks to technology, humanity has been growing at an exponential rate. Nowadays, it seems like something revolutionary is invented every other week. Without the use of technology it would be hard to have medical units as advanced as our current ones. Without technology we would not be able to speak to each other across the world and communicate ideas at speeds never seen before. As the creators of technology we must also be aware of all the negative effects it has had along with positive ones. Exponential growth of technology comes at an expense to the Earth and everyone that lives on it. Global warming, collapse of ecosystems, and the depletion of natural resources are just a few of the ways technology has taxed planet Earth. The desecration of this planet has bore us great fruits of ambition, but how far will we go before humanity finally pays its tolls?";
    String text2 = "Thankfully, there are people that understand the underlying problem to the golden goose known as technology. As technology tries to fix its own problem with solar panels, wind turbines, hydroelectric dams and more, we, the people, need to assist in our own ways. Recycling, supporting of non plastics, or even just remembering to turn off the lights when you do not need them is crucial. Should we choose to remain ignorant we would also be choosing to jump out of the frying pan and into the fire.";
    String text3 = "The Canadian government has their own department dedicated to the coordination of environmental policies and preservation of natural resources. They want to inform canadians about how they can preserve the environment as well as our natural heritage. Some of the ways they have been using their funds include the creation of a protection program for endangered species in Southwestern British Columbia. Canada is known for not being all too polluted which we owe the thanks to organizations such as these.";
    String q1="What is a reason why technology has been a key part of civilization? 1: Allows for humans to be lazy 2: Advances our communications 3: Instills fear within those who does not understand it";
    String q2="What are some side effects of technology? 1: global warming, collapse of ecosystems, and lower human attention span 2: global warming, world shortage on tea, and depletion of natural resources 3: global warming, collapse of ecosystems, and depletion of natural resources";
    String q3="How can normal people help? 1: Recycling 2: Consumption of frying pan 3: Ignore the problem";
    String q4="Where is the canadian government department dedicated to the preservation of our natural heritage creating an endangered species protection program? 1: Yukon 2: P.E.I. 3: Southwestern British Columbia";
    //loop
    while (true){
      System.out.println(text1);
      System.out.println("Enter 1 for next text");
      answer = Integer.parseInt(keyboard.nextLine());
      if (answer==1){
        System.out.println(text2);
        System.out.println("Enter 1 for next text");
        answer = Integer.parseInt(keyboard.nextLine());
        if (answer==1){
          System.out.println(text3);
          System.out.println("Enter 1 for test");
          answer = Integer.parseInt(keyboard.nextLine());               if (answer==1){
            System.out.println(q1);
            answer=Integer.parseInt(keyboard.nextLine());
            if (answer==2){
              points++;
            }
            System.out.println(q2);
            answer=Integer.parseInt(keyboard.nextLine());
            if (answer==3){
              points++;
            }
            System.out.println(q3);
            answer=Integer.parseInt(keyboard.nextLine());
            if (answer==1){
              points++;
            }
            System.out.println(q4);
            answer=Integer.parseInt(keyboard.nextLine());
            if (answer==3){
              points++;
            }
          }
        }
      }
      System.out.println("You scored: "+points/4*100+"%");
      System.out.println("Would you like to redo the test? 1: Yes 2:No");
      answer=Integer.parseInt(keyboard.nextLine());
      if (answer==1){
        continue;
      } else if (answer==2){
        break;
      } else {
        System.out.println("Invalid Input");
      }
    }
  }
}