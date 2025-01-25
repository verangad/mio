function updateProficiencies()
{
    let proficiencies = document.getElementById("proficiencies").value
    let languages = document.getElementById("languages").value

    fetch("/updateProficiencies", {
      method: "POST",
      body: JSON.stringify({
        proficiencies: proficiencies,
        languages: languages,
        completed: false
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}

function updateSpellcasting()
{
    let scAbilityAddend = document.getElementById("sc-ability-addend").value
    let scAbility = document.getElementById("sc-ability").value
    let spellDCAddend = document.getElementById("spell-dc-addend").value
    let spellDC = document.getElementById("spell-dc").value
    let atkBonusAddend = document.getElementById("atkBonus-addend").value
    let atkBonus = document.getElementById("atkBonus").value

    fetch("/updateSpellcasting", {
      method: "POST",
      body: JSON.stringify({
        scAbility: {
            x: scAbilityAddend,
            y: scAbility
        },
        spellDC: {
            x: spellDCAddend,
            y: spellDC
        },
        atkBonus: {
            x: atkBonusAddend,
            y: atkBonus
        }
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}

function updateSavingThrows()
{
    let strengthCheckbox = document.getElementById("strength-checkbox").checked
    let strength = document.getElementById("strength").value
    let dexterityCheckbox = document.getElementById("dexterity-checkbox").checked
    let dexterity = document.getElementById("dexterity").value
    let constitutionCheckbox = document.getElementById("constitution-checkbox").checked
    let constitution = document.getElementById("constitution").value
    let intelligenceCheckbox = document.getElementById("intelligence-checkbox").checked
    let intelligence = document.getElementById("intelligence").value
    let wisdomCheckbox = document.getElementById("wisdom-checkbox").checked
    let wisdom = document.getElementById("wisdom").value
    let charismaCheckbox = document.getElementById("charisma-checkbox").checked
    let charisma = document.getElementById("charisma").value

    fetch("/updateSavingThrows", {
      method: "POST",
      body: JSON.stringify({
        strength: {
            x: strength,
            y: strengthCheckbox
        },
        dexterity: {
            x: dexterity,
            y: dexterityCheckbox
        },
        constitution: {
            x: constitution,
            y: constitutionCheckbox
        },
        intelligence: {
            x: intelligence,
            y: intelligenceCheckbox
        },
        wisdom: {
            x: wisdom,
            y: wisdomCheckbox
        },
        charisma: {
            x: charisma,
            y: charismaCheckbox
        }
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}

function updateBag()
{
    let bag = document.getElementById("bag").value
    let copper = document.getElementById("copper").value
    let silver = document.getElementById("silver").value
    let electrum = document.getElementById("electrum").value
    let platinum = document.getElementById("platinum").value

    fetch("/updateBag", {
      method: "POST",
      body: JSON.stringify({
        contents: bag,
        copper: copper,
        silver: silver,
        electrum: electrum,
        platinum: platinum
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}

function updateDetails()
{
    let characterName = document.getElementById("characterName").value
    let atName = document.getElementById("atName").value
    let age = document.getElementById("age").value
    let height = document.getElementById("height").value
    let weight = document.getElementById("weight").value

    let alignment = document.getElementById("alignment").value
    let characterClass = document.getElementById("class").value
    let level = document.getElementById("level").value
    let race = document.getElementById("race").value
    let followers = document.getElementById("followers").value

    fetch("/updateDetails", {
      method: "POST",
      body: JSON.stringify({
        characterName: characterName,
        atName: atName,
        age: age,
        height: height,
        weight: weight,
        alignment: alignment,
        classType: characterClass,
        level: level,
        race: race,
        followers: followers
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}

function updateStats()
{
    let proficiencyBonus = document.getElementById("proficiencyBonus").value
    let strStat = document.getElementById("strStat").value
    let strStatAddend = document.getElementById("strStatAddend").value
    let dexStat = document.getElementById("dexStat").value
    let dexStatAddend = document.getElementById("dexStatAddend").value
    let conStat = document.getElementById("conStat").value
    let conStatAddend = document.getElementById("conStatAddend").value
    let intStat = document.getElementById("intStat").value
    let intStatAddend = document.getElementById("intStatAddend").value
    let wisStat = document.getElementById("wisStat").value
    let wisStatAddend = document.getElementById("wisStatAddend").value
    let chaStat = document.getElementById("chaStat").value
    let chaStatAddend = document.getElementById("chaStatAddend").value

    let armorClass = document.getElementById("armorClass").value
    let initiative = document.getElementById("initiative").value
    let speed = document.getElementById("speed").value
    let health = document.getElementById("health").value
    let maxHealth = document.getElementById("maxHealth").value
    let tempHealth = document.getElementById("tempHealth").value

    let maxHitDice= document.getElementById("maxHitDice").value
    let hitDice = document.getElementById("hitDice").value

    fetch("/updateStats", {
      method: "POST",
      body: JSON.stringify({
        proficiencyBonus: proficiencyBonus,
        strength: {
            x: strStatAddend,
            y: strStat
        },
        dexterity: {
            x: dexStatAddend,
            y: dexStat
        },
        constitution: {
            x: conStatAddend,
            y: conStat
        },
        intelligence: {
            x: intStatAddend,
            y: intStat
        },
        wisdom: {
            x: wisStatAddend,
            y: wisStat
        },
        charisma: {
            x: chaStatAddend,
            y: chaStat
        },
        armorClass: armorClass,
        initiative: initiative,
        speed: speed,
        health: {
            x: health,
            y: maxHealth
        },
        hitDice: {
            x: hitDice,
            y: maxHitDice
        },
        tempHealth: tempHealth
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}

function updateSkills()
{
    let acrobatics = document.getElementById("acrobatics").value
    let animalHandling = document.getElementById("animalHandling").value
    let arcana = document.getElementById("arcana").value
    let athletics = document.getElementById("athletics").value
    let deception = document.getElementById("deception").value
    let history = document.getElementById("history").value
    let insight = document.getElementById("insight").value
    let intimidation = document.getElementById("intimidation").value
    let investigation = document.getElementById("investigation").value
    let medicine = document.getElementById("medicine").value
    let nature = document.getElementById("nature").value
    let navigation = document.getElementById("navigation").value
    let perception = document.getElementById("perception").value
    let performance = document.getElementById("performance").value
    let persuasion = document.getElementById("persuasion").value
    let religion = document.getElementById("religion").value
    let sleightOfHand = document.getElementById("sleightOfHand").value
    let stealth = document.getElementById("stealth").value
    let survival = document.getElementById("survival").value
    let passiveWisdom = document.getElementById("passiveWisdom").value

    let acrobaticsCheckbox = document.getElementById("acrobaticsCheckbox").checked
    let animalHandlingCheckbox = document.getElementById("animalHandlingCheckbox").checked
    let arcanaCheckbox = document.getElementById("arcanaCheckbox").checked
    let athleticsCheckbox = document.getElementById("athleticsCheckbox").checked
    let deceptionCheckbox = document.getElementById("deceptionCheckbox").checked
    let historyCheckbox = document.getElementById("historyCheckbox").checked
    let insightCheckbox = document.getElementById("insightCheckbox").checked
    let intimidationCheckbox = document.getElementById("intimidationCheckbox").checked
    let investigationCheckbox = document.getElementById("investigationCheckbox").checked
    let medicineCheckbox = document.getElementById("medicineCheckbox").checked
    let natureCheckbox = document.getElementById("natureCheckbox").checked
    let navigationCheckbox = document.getElementById("navigationCheckbox").checked
    let perceptionCheckbox = document.getElementById("perceptionCheckbox").checked
    let performanceCheckbox = document.getElementById("performanceCheckbox").checked
    let persuasionCheckbox = document.getElementById("persuasionCheckbox").checked
    let religionCheckbox = document.getElementById("religionCheckbox").checked
    let sleightOfHandCheckbox = document.getElementById("sleightOfHandCheckbox").checked
    let stealthCheckbox = document.getElementById("stealthCheckbox").checked
    let survivalCheckbox = document.getElementById("survivalCheckbox").checked
    let passiveWisdomCheckbox = document.getElementById("passiveWisdomCheckbox").checked


    fetch("/updateSkills", {
      method: "POST",
      body: JSON.stringify({
        acrobatics: {
            x: acrobatics,
            y: acrobaticsCheckbox
        },
        animalHandling: {
            x: animalHandling,
            y: animalHandlingCheckbox
        },
        arcana: {
            x: arcana,
            y: arcanaCheckbox
        },
        athletics: {
            x: athletics,
            y: athleticsCheckbox
        },
        deception: {
            x: deception,
            y: deceptionCheckbox
        },
        history: {
            x: history,
            y: historyCheckbox
        },
        insight: {
            x: insight,
            y: insightCheckbox
        },
        intimidation: {
            x: intimidation,
            y: intimidationCheckbox
        },
        investigation: {
            x: investigation,
            y: investigationCheckbox
        },
        medicine: {
            x: medicine,
            y: medicineCheckbox
        },
        nature: {
            x: nature,
            y: natureCheckbox
        },
         navigation: {
            x: navigation,
            y: navigationCheckbox
        },
        perception: {
            x: perception,
            y: perceptionCheckbox
        },
        performance: {
            x: performance,
            y: performanceCheckbox
        },
        persuasion: {
            x: persuasion,
            y: persuasionCheckbox
        },
        religion: {
            x: religion,
            y: religionCheckbox
        },
        sleightOfHand: {
            x: sleightOfHand,
            y: sleightOfHandCheckbox
        },
        stealth: {
            x: stealth,
            y: stealthCheckbox
        },
        survival: {
            x: survival,
            y: survivalCheckbox
        },
        passiveWisdom: {
            x: passiveWisdom,
            y: passiveWisdomCheckbox
        }
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}

