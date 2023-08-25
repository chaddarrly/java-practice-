

#include<iostream>
#include<fstream>
#include<string>
#include<stdlib.h>
#include<time.h>

using namespace std;

int main(){
    
    ifstream file("Document.txt");
    if(file.is_open())
    {
        string myArray[20];

        for(int i = 0; i < 20; ++i)
        {
            file >> myArray[i];
        
    

    string ch;

    string guess = "";
    int ind = rand()%20;
    string data = "" ;
   
    for (int i = 0; i<myArray[ind].size(); i++)
        data = data + "*";
    int count = 0;
   
    while(1){
       while(1) {
           cout << "(Guess) Enter a letter in word "<< data << " > ";
           cin >> ch;
           count++;
           int miss_count = 0;
           for (int i = 0; i<myArray[ind].size(); i++){
              int found = 0;
              if (myArray[ind][i] == ch[0]){
                 found = 1;
                 if (data[i] != ch[0])
                    data[i] = ch[0];
                 else
                    cout << ch[0] << " is already in the word. " << endl;
              
              }
              if (found == 0)
                 miss_count++;
           }
           if (data == myArray[ind]){
              cout << "The word is " << data << ". You missed " << miss_count << " time" << endl;
              break;
           }  
      }
      cout << "Do you want to guess for another word? enter y or n>";
      cin >> ch;
      if (ch[0] == 'n')
         break;
   }
  }
  }
}
