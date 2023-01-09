$Message = Read-Host -prompt "Enter Commit Message "

Write-Output "Your commit message is  $Message"
git add .
git commit -m "$Message"
git push -u origin main


