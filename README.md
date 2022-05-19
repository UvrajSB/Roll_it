# Tutorial on Introduction to Native Android Development
## Notes
* We work on two different types of files - kotlin files and XML files
* We create and arrange all the UI elements (views) in XML file.
* Views are arranged using *layouts*, in this app we have used `constraint layout`.
* Once the views are created and arranged properly in XML file, we move to Kotlin (.kt) file where we write the all the programs which determine the interaction with those views.
* As the views are created in XML file but the functionality of those views is generated by the programs in kotlin file. So, we need reference of views in kotlin file. We use `findViewById` for that.
* `findViewById` creates the reference of the views in kotlin file by the help of `id` defined in XML file for respective views.
* We then created a function `roll()` which simply returns a random int between 1 to 6.
* ![image](https://user-images.githubusercontent.com/73571511/166494210-87f56e0a-dfaf-4d6e-9a5e-a687d9409383.png)
*  After that we used *when* statement to get the corresponding image resource to use in the imageView everytime user press Roll button and the image needs to be updated.
*  ![image](https://user-images.githubusercontent.com/73571511/166494832-39f77a01-b493-4f50-ba3a-b95af8f91805.png)
*  Finally we set the resource using `setImageResource` method.
*  We also displayed a Toast - which is nothing but a message that is displayed on the screen stating what number you have got.

## Screenshots of the app
<img src="https://user-images.githubusercontent.com/73571511/166497101-1b7d7032-092e-46c0-b541-78b41fec635e.jpeg" width = "250" height = "500"/>
<img src="https://user-images.githubusercontent.com/73571511/166497085-4d029de9-01a1-4a33-bc2f-b9bfe0271fed.jpeg" width = "250" height = "500"/>

## How to clone the app
* Please star the repo first. (So that I can know that you are doing the task)
* ![image](https://user-images.githubusercontent.com/73571511/166498231-1ba2a0ad-a5d9-4284-9f6d-b49629c91b66.png)
* In android studio go to File > New > Project from version control
* ![image](https://user-images.githubusercontent.com/73571511/166498569-c8d85ca7-7d79-4d3c-8e77-9e799cf0e955.png)
* On the repo click on *code* and then copy the HTTPS from there
* ![image](https://user-images.githubusercontent.com/73571511/166499042-a2f9843a-b1ee-4e21-b91b-6c071811153e.png)
* Copy this HTTPS in android studio
* ![image](https://user-images.githubusercontent.com/73571511/166499370-ae9acefe-a55f-42f0-bf65-be38714645f6.png)
* Just click on `clone` and now you are good to go.


## How to run the app
Please go through this if you dont have an AVD already (To check it just press Run button and see if an AVD is opening up or not)

https://youtu.be/6CIPovJxty8





