<!-- ABOUT THE PROJECT -->
## Project Description

The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from the unsorted part and putting it at the beginning.

The algorithm maintains two subarrays in a given array.

The subarray which already sorted.
The remaining subarray was unsorted.
In every iteration of the selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.

```Java
Lets consider the following array as an example: arr[] = {64, 25, 12, 22, 11}

        First pass:
        For the first position in the sorted array, the whole array is traversed from index 0 to 4 sequentially. The first position where 64 is stored presently, after traversing whole array it is clear that 11 is the lowest value.
        64 25 12 22 11
        Thus, replace 64 with 11. After one iteration 11, which happens to be the least value in the array, tends to appear in the first position of the sorted list.
        11 25 12 22 64
        
        Second Pass:
        For the second position, where 25 is present, again traverse the rest of the array in a sequential manner.
        11 25 12 22 64
        After traversing, we found that 12 is the second lowest value in the array and it should appear at the second place in the array, thus swap these values.
        11 12 25 22 64
        
        Third Pass:
        Now, for third place, where 25 is present again traverse the rest of the array and find the third least value present in the array.
        11 12 25 22 64
        While traversing, 22 came out to be the third least value and it should appear at the third place in the array, thus swap 22 with element present at third position.
        11 12 22 25 64
        
        Fourth pass:
        Similarly, for fourth position traverse the rest of the array and find the fourth least element in the array
        As 25 is the 4th lowest value hence, it will place at the fourth position.
        11 12 22 25 64
        
        Fifth Pass:
        At last the largest value present in the array automatically get placed at the last position in the array
        The resulted array is the sorted array.
        11 12 22 25 64   
```

Program will take total number of elements in an array and individual elements as input from a user. Program should sort and prints the sorted array to the screen.

<!-- TECHNOLOGIES -->
### Technologies


<a href="https://www.java.com/" target="_blank"><img src="https://raw.githubusercontent.com/mehmet-akif-tanisik/ebebekJavaPracticumHomeworks/779b5d6e2264b20bcafdc3c6a517048042aa799f/images/java.svg" alt="Java" height="80" /></a>




<!-- OUTPUT SCREENSHOTS -->
### Output Screenshots
<!--CHANGE ONLY SRC -NOTHING ELSE -->
<img src="https://raw.githubusercontent.com/mehmet-akif-tanisik/ebebekJavaPracticumHomeworks/main/images/outputSS/week4/sort.png" alt="selection-sort" />


<!-- LICENSE -->
## License
![GitHub](https://img.shields.io/github/license/mehmet-akif-tanisik/ebebekJavaPracticumHomeworks?style=for-the-badge)


Distributed under the MIT License. See `LICENSE.txt` for more information.




<!-- CONTACT -->
## Contact

### Mehmet Akif Tanisik 

<a href="https://github.com/mehmet-akif-tanisik" target="_blank">
<img  src=https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white alt=github style="margin-bottom: 20px;" />
</a>
<a href = "mailto:matnsk@outlook.com?subject = Feedback&body = Message">
<img src=https://img.shields.io/badge/send-email-email?&style=for-the-badge&logo=microsoftoutlook&color=CD5C5C alt=microsoftoutlook style="margin-bottom: 20px; margin-left:20px" />
</a>
<a href="https://linkedin.com/in/mehmet-akif-tanisik" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 20px; margin-left:20px" />
</a>  
<a href="https://twitter.com/makiftanisik" target="_blank">
<img src=https://img.shields.io/badge/twitter-%2300acee.svg?&style=for-the-badge&logo=twitter&logoColor=white alt=twitter style="margin-bottom: 20px; margin-left:20px" />
</a>

<!-- PROJECT-BOOTCAMP-PRACTICUM PART -->
<br />

## ebebek Java & QA & SAP Spartacus Practicum
<div align="center">
  <a href="https://www.e-bebek.com">
    <img src="https://raw.githubusercontent.com/mehmet-akif-tanisik/ebebekJavaPracticumHomeworks/main/images/ebebek-logo.png" alt="Logo" width="200" height="50">
  </a>

<h3 align="center">Company: ebebek</h3>
</div>
<br>
<br><br>
<div align="center">
  <a href="https://www.patika.dev/tr">
    <img src="https://raw.githubusercontent.com/mehmet-akif-tanisik/ebebekJavaPracticumHomeworks/779b5d6e2264b20bcafdc3c6a517048042aa799f/images/patika-logo.svg" alt="Logo" width="240" height="50">
  </a>
<h3 align="center">Organizer: Patika.dev</h3>
</div>

