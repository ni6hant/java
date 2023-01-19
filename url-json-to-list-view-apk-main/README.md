# url-json-to-list-view-apk
An android application that takes in a JSON from a given URL and displays the JSON in a list view.

# My Journey with this application
I got an interview invitation for a company which had too pass in a JSON which contained three parameters for each employee: name, age and salary.
Seeing how I just had started learning JAVA this felt like a daunting task to do on my own and hence I google how to do exactly the same, and I saw a bunch of YouTube Totorial Videos.

I started with this one: [Parsing JSON from URL into ListView - [JSON Parsing Course #5] by Master Coding](https://www.youtube.com/watch?v=v4X0y6-VOtM)

While doing the course I came across an IDE feature which when you see online can confuse you. Thankfully, since I was already doing many Java courses online, I figured out what I was doing wrong and I also commented the same in the video under the YouTube Channel: MakingTechFriendly.

> CAUTION FOR BEGINNERS
> @14:33 @19:47
> Line 98, 104, 105, 133
> If you're new to programming like me you must not have realized that the name: came in automatically. Thankfully I was doing some other courses and I realized this after half an hour of debugging that I was actually putting down the code as exactly shown which is:
>                JSONArray jsonArray = jsonObject.getJSONArray(name: "employees");
> The reality is the fact that if it's actually
>                JSONArray jsonArray = jsonObject.getJSONArray("employees");
> The name: is merely a way to help you while coding. If you try to even copy the code it won't copy the invisible name: as it's a hint, not actual code.
> I know, it's confusing as hell for new people.

After, I fixed that error after hours of figuring out what was wrong, I ran into another error. The hashmap error, and I suspected since this being a three year old video now maybe things have changed. I knew Java wouldn't but I know Google like to f*** with your muscle memory. Look at what they did to all the Google Android Applications Icons and Kotlin. Therefore, I commented that is this tutorial too old and the guy since he was selling his own course through this video, why would he say yes. I was stupid even asking this question. As we say in hindi: *Apni sabji ko basi thode bolta hain koi* which means, "No Vegetable Seller calls his vegetables stale".

So, I went after another video, this one to be specific: [JSON Parsing - Parse JSON Data from Web URL in Android | Android Studio Tutorial | 2021](https://www.youtube.com/watch?v=5lNQLR53UtY)

This being a newer tutorial, I assumed this would do the trick.

A note on Indian Tutorials: I never follow Indian people's video tutorial especially when it comes to education, for the single reason many of them either are faking it, many others just copied someone else's tutorial without referencing them, and a huge bunch of them would do anything for views. Not everyone, but the evil percentage is so much that you will always be in doubt if you're watching a legit video or after wasting hours of your life, realize it later that it was all fake and you're a monkey.
P.S: I am Indian.

I guess fear played a big role. The deadline already passed a day ago and I thought I could speedup the process by just following an online tutorial. A few hours later I looked at the code and I realized that guy wasn't even passing the JSONObjects to the android application he was building and I was furious. This reaffirmed my thikning about the Indian Videos on YouTube, I decided I was never going to follow any more such Videos. I commented the same:
> This doesn't work.  I am new to this but when did you ever pass the buffered read data to the line string?
>I guess that's why you didn't show the app being built on the system itself.

Now that I had veered off course and did this the wrong way, I am coming back to the problem after a good night's sleep and the first thing that hit me is the things I had learnt in my Java Journey especially, breaking the bigger problem down.

Also, I hated the codes that I saw. No detailed variable named declaration, what the hell is lv? How can you shorten a listView to lv is beyond me. Also, using the default data types like TextView1 and TextView2! If people are learning JAVA from YouTube with such tutorials, they are doomed. The supposed Master of Coding got confused himself as to what was going, while making the try and catch statement.
I know anyone can get a bit confused. What bothers me is the way he tackled the problem. That's what's bothered me. He programmed line by line, a horrible way to program. This is not how [Mehran Sahami](https://see.stanford.edu/course/cs106a) taught me.
Also, regarding the comments, they were non-existent. I remember watching a lecture given by Andy Harri[How to Think Like a Programmer](https://youtu.be/azcrPFhaY9k)
> Comments are not there to explain your code to other programmers. Codes are there to explain the comments to the computer. - Andy Harris

So I decided let's just make a Java Application which would clear HashMaps for me and if I can make a hasmap dummy by myself, maybe I can make the app. So, the roadmap for me is going to be the following along with the version I am going to update them with:
0.1 Output the JSONObject to just display on String and learn a bit about Hashmaps
0.2 Pass in a local file to output a local JSON file
0.3 Pass in a URL to output a JSON file on the internet
0.4 Make an android application with a simple activity and differentiate it from a blank activity. This would help me in clearing some confusion on how to move between activities.
0.5 ... Will see later
