# toasteR
[![](https://jitpack.io/v/KayesAshfaQ/toastR.svg)](https://jitpack.io/#KayesAshfaQ/toastR)

Custom toast maker for android.

### To add a Git project into your build:

Step 1. Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.KayesAshfaQ:toastR:Tag'
	}
  
  
  
  ## Usage 


Just call your required method form ToasteR class.

To display an error Toast:

	ToasteR.toasterError(this, "This is a error toast!");


To display an success Toast:

	ToasteR.toasterSuccess(this, "This is a success toast!");


 To display an warning Toast:
 
	ToasteR.toasterWarn(this, "This is a warning toast!");
	
	
	
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
