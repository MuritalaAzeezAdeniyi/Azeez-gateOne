from datetime import datetime

from datetime import timedelta

welcome_speech = ("Welcome to Abdulazeez Menstrual Cycle Calculator! We're happy to help you track your cycle and stay informed about your body, Let's get started and help you better understand your cycle.")
print(welcome_speech)

last_menstural_day = str(input("Enter The Date of your last Menstrual flow (DD/MM/YYYY): "))

date_format = '%d/%m/%Y'

last_menstural = datetime.strptime(last_menstural_day, date_format) 

cycle_Length = int(input("Enter The Average Length of your Cycle In Day: "))

length_to_ovulation = cycle_Length / 2

nextMenstrual = last_menstural + timedelta(days=cycle_Length)

print(f'Your Next Menstrual will start on {nextMenstrual}')

ovulationDate = last_menstural + timedelta(days = length_to_ovulation)

print(f'Your ovulation Date Is: {ovulationDate}')

fertilePriodSter = ovulationDate - timedelta(days = 5)

fertilePriodEnd = ovulationDate + timedelta(days = 2)

print(f'Your fertile period is Between: {fertilePriodSter} to {fertilePriodEnd}')

safePeriodStart = fertilePriodEnd + timedelta(days = 1)

SafePeriodEnd = nextMenstrual - timedelta(days = 1)

print(f'Your safe period is Between {safePeriodStart} to {SafePeriodEnd}');







