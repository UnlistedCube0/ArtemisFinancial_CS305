# ArtemisFinancial_CS305

1) Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

   Artemis Financial is a consulting company that develops financial plans for its customers. They are in the process of modernizing their operations and want new features implemented with secure coding practices. The code within this repository featured a secured file input feature with a Hashing algorithm to provide file integrity. 



2) What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

   In this project, I did well with reiterating over the code as the feature developed, ensuring my code was not introducing new vulnerabilities. Additionally, I did my best to thoroughly research current vulnerabilities to identify mitigration techniques, whether that's updating a dependency to a newer version or refactoring how a function operates within the code. This is important because the company handled financial records that could be prime targets for bad actors. If Artemis Financial were a victim of a DoS, file injection, or other attack, they could lose money as well as current and future clients. 



3) Which part of the vulnerability assessment was challenging or helpful to you?

  Identifying false positives was the most challenging because it required more understanding of each vulnerability. Usually, a true positive is easier to identify because you can quickly see which functions or features of a dependency might be causing the vulnerability. However, with false positives, it's difficult to know if the vulnerability is just deeply hidden or if it's not there at all. 



4) How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?.

   I increased layered security by attacking it from multiple perspectives. By running a static check, I'm identifying dependency vulnerabilities and by scanning the code manually, I'm identifying sytanxial, logical, and other errors within the codes functions themselves. Additionally, I implemented a hash-algorith which provides input integrity to ensure inputs weren't changed during transmission. Lastly, I enabled HTTPS. This secured protocol the communication between the server/client with encryption. In the future, I would continue implementing these techniques and using best security practices. 



5) How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

   While I can never be certain a software application is 100% secure, I did do a static vulnerability assessment before making changes and followed my refactoring with a 2nd static assessment to ensure no new vulnerabilities were introduced. 



6) What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
 
   I used multiple sources including my textbook, OWASP vulnerability reports, documentation from the U.S. Institute of Standards and Technology, and as many articles on secure coding practices as I could find. These helped me learn and implement secure coding practices. 



7) Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

  This assignment will allow me to show employers my understanding of secure coding best practices, implementationon of encryption and hashing algorithms, and vulnerability assessment techniques.
