# Android Project 3 - *Show Me The Movies!*

Submitted by: **Charles Lett Jr.**

**Show Me The Movies!** is a movie browsing app that allows users to browse movies currently playing in theaters.

Time spent: **13** hours spent in total

## Required Features

The following **required** functionality is completed:

- [X] **Make a request to [The Movie Database API's `now_playing`](https://developers.themoviedb.org/3/movies/get-now-playing) endpoint to get a list of current movies**
- [X] **Parse through JSON data and implement a RecyclerView to display all movies**
- [X] **Use Glide to load and display movie poster images**

The following **optional** features are implemented:

- [X] Improve and customize the user interface through styling and coloring
- [X] Implement orientation responsivity
  - App should neatly arrange data in both landscape and portrait mode
- [X] Implement Glide to display placeholder graphics during loading
    <img src='https://github.com/cclett2000/Show_Me_The_Movies/blob/master/glide_placeholder_code_snip.PNG' title='Placeholder Graphics Code' width='' alt='Placeholder Graphics Code' />

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://github.com/cclett2000/Show_Me_The_Movies/blob/master/FlixsterAppDemo.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
<img src='https://github.com/cclett2000/Show_Me_The_Movies/blob/master/FlixsterAppDemo_Landscape.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
GIFs created with [LiceCap](http://www.cockos.com/licecap/). 

## Notes
- I completely forgot that in order to reach the API I needed to give internet permissions
  - the amount of time spent trying to figure this out is embarassing (~3 hours)
- Jackson is slower than Gson when it comes to JSON parsing on Android
- In order to use the internet I had to set the permission in my manifest file
  - this also took an embarassingly long time to figure out

## License

    Copyright [2022] [Charles Lett Jr.]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
