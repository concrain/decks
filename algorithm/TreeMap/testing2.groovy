enum EligibilityResult { IS_ELIGIBLE, NOT_ELIGIBLE }

class Patient {
    String firstName, lastName, dateOfBirth, memberIDorAIN
    EligibilityResult eligibilityResult
}

Patient p1 = new Patient()
p1.firstName = "Marcus"
p1.lastName = "Rawson"
p1.dateOfBirth = "8/23/1968"
println p1.firstName

Patient p2 = new Patient()
p2.firstName = "Greg"
p2.lastName = "Harabedian"
p2.dateOfBirth = "10/19/1965"
println p2.firstName

def humanaEligibilityMock(Patient pat) {
    def tree
    tree = { -> return [:].withDefault{ tree() } }
    def memberInfo = tree()
    
    if (pat.firstName == "Marcus" && pat.lastName && "Rawson" && pat.dateOfBirth == "8/23/1968") {
        memberInfo.value.memberDetails.value.firstName = 'Marcus'
        memberInfo.value.memberDetails.value.lastName = 'Rawson'
        memberInfo.value.memberDetails.value.dateOfBirth = '8/23/1968'
        memberInfo.value.memberDetails.value.memberIDorAIN = "10418082368    "
        memberInfo.value.eligibilityResult = EligibilityResult.IS_ELIGIBLE
    }
    if (pat.firstName == "Greg" && pat.lastName && "Harabedian" && pat.dateOfBirth == "10/19/1965") {
        memberInfo.value.memberDetails.value.memberIDorAIN = "01294222801"
        memberInfo.value.eligibilityResult = EligibilityResult.NOT_ELIGIBLE
    }
    memberInfo
}

// memberInfo.memberDetails
Map memberInfo = [:]
memberInfo = humanaEligibilityMock(p1)
println memberInfo.value.memberDetails.value
println memberInfo.value.memberDetails.value.firstName
println memberInfo.value.eligibilityResult

Map memberInfo2 = [:]
memberInfo2 = humanaEligibilityMock(p2)
println memberInfo2.value.memberDetails.value
println memberInfo2.value.memberDetails.value.firstName
println memberInfo2.value.eligibilityResult