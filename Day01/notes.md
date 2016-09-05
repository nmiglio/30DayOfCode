#C Solution
The most difficult part was to find the correct format to pass to the last scanf.
At the beginning I didn't realize that there was a trailing \n after reading the double. This messed up the next scanf.
I had to take care of the newline first and then store the string. 
The string included some spaces and I admit that the use of [^\n] in scanf was new to me. 
Good to know!
