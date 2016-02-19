def memberInfo = [:]
memberInfo << [memberDetails:[value:[memberFirstName:[value:'Marcus']]]]
println memberInfo.memberDetails.value.memberFirstName.value
assert memberInfo.memberDetails.value.memberFirstName.value == 'Marcus'






  /** Mock setup */
  enum EligibilityResult { IS_ELIGIBLE, NOT_ELIGIBLE }

  def eligibilityMock(Patient pat) {
    def tree
    tree = { -> return [:].withDefault{ tree() } }
    def member = tree()

    if (pat.firstName == "Mike" && pat.lastName && "Smith") {
      member.memberInfo.memberDetails.value.memberFirstName.value = 'Mike'
      member.memberInfo.memberDetails.value.memberLastName.value = 'Smith'
      member.memberInfo.memberDetails.value.memberDOB.value = '8/23/1968'
      member.memberInfo.memberDetails.value.memberIDorAIN.value = "5555555555"
      member.memberInfo.eligibilityResult = EligibilityResult.IS_ELIGIBLE
    }

    if (pat.firstName == "Mike" && pat.lastName && "Smith") {
      member.memberInfo.memberDetails.value.memberIDorAIN.value = "5555555555"
      member.memberInfo.eligibilityResult = EligibilityResult.NOT_ELIGIBLE
    }
    member
  }
  
  assert eligiblePatient.firstName == memberInfo.memberDetails?.value?.memberFirstName?.value


eligiblePatient.firstName == memberInfo.memberDetails?.value?.memberFirstName?.value
|               |         |  |          |              |      |                |
|               Marcus    |  |          |              |      [value:[:]]      [:]
|                         |  |          |              [memberFirstName:[value:[:]]]
|                         |  |          [value:[memberFirstName:[value:[:]]]]
|                         |  [memberInfo:[memberDetails:[value:[memberFirstName:[value:Marcus]
|                         false
