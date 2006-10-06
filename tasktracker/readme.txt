readme.txt
Project description for TimeTracker 20061005

open source development site: http://developer.berlios.de/
project name: tasktracker

Instructions for using CVS repository
(image references to files in tasktracker/docs/dev_img)
--------------------------------------------------------------------------
1. Preferrably use Eclipse 3.2 as IDE
2. Visit the http://developer.berlios.de/ site and get familiar with the project hosting
facilities - ie. how cvs works, the forum, etc.
3. Get in touch with project administrator to get a developer username and pw.
4. Switch to 'CVS Repository Exploring perspective' in Eclipse
5. Create a new 'Repository location' (eclipse_dev_image_01.jpg)
6. CVS Settings in Eclipse
Before you import the project from CVS into Eclipse - make sure you have these settings
in Window->Preferences->Team->CVS->Watch/Edit (eclipse_dev_image_02.jpg)
7. In Eclipse 'Java perspective' create New->Project->CVS->Projects from CVS,
use existing Repository location (the one u just created), select 'Use an existing
module', ie. tasktracker, then, 'Check out as a project in the workspace'.
8. Once imported your project should look something similar to (eclipse_dev_image_03.jpg).
9. Working
To get an understanding of the project, read all the **/info.txt files and
also *this* file. Check the project site at berlios.de.
To start developing, preferrably make a copy of the project in a non-CVS enabled
and try to build it. See what you can contribute with.
10. Once in the phase of commiting files to the repository, make sure u DON'T COMMIT:
.* files (like .myeclipse, .project, .cvsignore, OR compiled/build/war'ed stuff).
Settings for CVS to ignore certain files can be done in Eclipse->Team->CVS.
