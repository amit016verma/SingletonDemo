# Simple SingletonDemo Pattern Design
#Introduction:

Singleton is the most common, simple pattern to learn and implement. A singleton class has only one instance and it can be accessed from
anywhere in our program.It can be used when we need our object to store sessions, database connections, communication protocols, etc. 

#WorkFlow:

I will create a simple application which will store username from login activity and print the message "Welcome Your Name" on welcome 
activity. The idea is to use a single class instance to store and get username in two different classes.
We will be ignoring username and password check, as the example is focus on the basic concept of singleton class.

As we are using 2 activities, LoginActivity and WelcomeActivity, we will be having 2 layouts activity_login.xml 
and activity_welcome.xml.

  LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // On login button click, storing our username into singleton class.
                Singleton.Instance().setUsername(userNameEditText.getText().toString());

                Intent welcomeActivity = new Intent(LoginActivity.this, WelcomeActivity.class);
                startActivity(welcomeActivity);
            }
        });
        
        
  //Displaying our username using singleton class.
        welcomeTV.setText("Welcom \n" + Singleton.Instance().getUsername());
